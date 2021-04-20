package com.carol.githubapp.repo

import com.carol.githubapp.api.models.Owner

interface RepoView {

    fun attachContributors(list: List<Owner>)

    fun changeMessage(message: String)

}