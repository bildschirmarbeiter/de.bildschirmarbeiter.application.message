package de.bildschirmarbeiter.application.message.spi;

import org.jetbrains.annotations.NotNull;
import org.osgi.annotation.versioning.ProviderType;

@ProviderType
public interface MessageService {

    void send(@NotNull final Object message);

    void register(@NotNull final Object listener);

    void unregister(@NotNull final Object listener);

}
