package com.marcinmejner.naukadaggerrxjavamvpmvvp.trending;

import com.marcinmejner.naukadaggerrxjavamvpmvvp.data.RepoRequester;
import com.marcinmejner.naukadaggerrxjavamvpmvvp.di.ScreenScore;

import javax.inject.Inject;

@ScreenScore
public class TrendingReposPresenter {

    private final TrendingReposViewModel viewModel;
    private final RepoRequester repoRequester;

    @Inject
    TrendingReposPresenter(TrendingReposViewModel viewModel, RepoRequester repoRequester){
        this.viewModel = viewModel;
        this.repoRequester = repoRequester;
        loadRepos();
    }

    private void loadRepos() {
        repoRequester.getTrendingRepos()
                .doOnSubscribe(__ -> viewModel.loadingUpdated().accept(true))
                .doOnEvent((d, t) -> viewModel.loadingUpdated().accept(false))
                .subscribe(viewModel.reposUpdated(), viewModel.onError());
    }

}
