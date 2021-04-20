package com.carol.githubapp.repo

interface RepoPresenter {

    fun getContributors(ownerName: String, repoName: String)

}