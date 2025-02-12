package at.hannibal2.skyhanni.config.features.mining;

import at.hannibal2.skyhanni.config.FeatureToggle;
import com.google.gson.annotations.Expose;
import io.github.notenoughupdates.moulconfig.annotations.ConfigEditorBoolean;
import io.github.notenoughupdates.moulconfig.annotations.ConfigOption;

public class HotmConfig {

    @Expose
    @ConfigOption(name = "Enabled Highlight", desc = "Highlights enabled perks in the hotm tree green and disabled red. Not unlocked perks are highlighted gray.")
    @ConfigEditorBoolean
    @FeatureToggle
    public boolean highlightEnabledPerks = true;

    @Expose
    @ConfigOption(name = "Level Stack", desc = "Shows the level of a perk as item stacks.")
    @ConfigEditorBoolean
    @FeatureToggle
    public boolean levelStackSize = true;

    @Expose
    @ConfigOption(name = "Token Stack", desc = "Shows unused tokens on the heart.")
    @ConfigEditorBoolean
    @FeatureToggle
    public boolean tokenStackSize = true;
}
