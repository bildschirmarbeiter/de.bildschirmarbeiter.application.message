package de.bildschirmarbeiter.application.message.base;

import java.util.UUID;

import de.bildschirmarbeiter.application.message.api.Message;
import org.jetbrains.annotations.NotNull;
import org.osgi.annotation.versioning.ConsumerType;

@ConsumerType
public abstract class AbstractMessage implements Message {

    private final long _timestamp = System.currentTimeMillis();

    private final UUID _uuid = UUID.randomUUID();

    private final Object _source;

    public AbstractMessage(@NotNull final Object source) {
        _source = source;
    }

    @Override
    @NotNull
    public Long timestamp() {
        return _timestamp;
    }

    @Override
    @NotNull
    public UUID uuid() {
        return _uuid;
    }

    @Override
    @NotNull
    public Object source() {
        return _source;
    }

}
