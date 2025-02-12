package at.hannibal2.skyhanni.utils.repopatterns

/**
 * A utility class for allowing easier definitions of [RepoPattern]s with a common prefix.
 */
class RepoPatternExclusiveGroup internal constructor(prefix: String, owner: RepoPatternKeyOwner?) :
    RepoPatternGroup(prefix, owner) {

    /**
     * @return returns any pattern on the [prefix] key space (including list or any other complex structure, but as a simple pattern
     * */
    fun getUnusedPatterns() = RepoPatternManager.getUnusedPatterns(prefix)
}
