.class public Lcom/thegrizzlylabs/sardineandroid/model/CurrentUserPrivilegeSet;
.super Ljava/lang/Object;
.source "CurrentUserPrivilegeSet.java"


# annotations
.annotation runtime Lorg/simpleframework/xml/Root;
.end annotation


# instance fields
.field public privileges:Ljava/util/List;
    .annotation runtime Lorg/simpleframework/xml/ElementList;
        inline = true
        type = Lcom/thegrizzlylabs/sardineandroid/model/Privilege;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
