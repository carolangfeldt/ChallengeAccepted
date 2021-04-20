package com.carol.githubapp.owner

import com.carol.githubapp.api.models.Item

interface OwnerView {

    fun attachRepos(items: List<Item>)

}