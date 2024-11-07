package org.openstack4j.model.trove;

import java.util.Date;

public interface Backup {
    String getName();

    String getSize();

    Date getCreated();

    Date getUpdated();

    String getId();

    String getStatus();
}
