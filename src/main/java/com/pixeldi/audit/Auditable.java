package com.pixeldi.audit;

public interface Auditable {

    Audit getAudit();

    void setAudit(Audit audit);
}
