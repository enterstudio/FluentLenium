package org.fluentlenium.core;

import org.fluentlenium.core.action.InputControl;
import org.fluentlenium.core.alert.AlertControl;
import org.fluentlenium.core.components.ComponentInstantiator;
import org.fluentlenium.core.css.CssControl;
import org.fluentlenium.core.domain.FluentWebElement;
import org.fluentlenium.core.events.EventsControl;
import org.fluentlenium.core.inject.FluentInjectControl;
import org.fluentlenium.core.navigation.NavigationControl;
import org.fluentlenium.core.script.JavascriptControl;
import org.fluentlenium.core.search.SearchControl;
import org.fluentlenium.core.snapshot.SnapshotControl;
import org.fluentlenium.core.wait.AwaitControl;

public interface FluentControl extends SearchControl<FluentWebElement>, AwaitControl, InputControl, JavascriptControl, AlertControl, SnapshotControl, EventsControl, NavigationControl, SeleniumDriverControl, CssControl, FluentInjectControl, ComponentInstantiator {

}
