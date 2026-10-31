.class public final Ll/ܺ۬᩵;
.super Ljava/lang/Object;
.source "HAYQ"

# interfaces
.implements Ll/᩶۬᩵;


# instance fields
.field public final ᩸:Z


# direct methods
.method public constructor <init>(Z)V
    .locals 0

    .line 1310
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Ll/ܺ۬᩵;->᩸:Z

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1312
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Empty{"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1310
    iget-boolean v1, p0, Ll/ܺ۬᩵;->᩸:Z

    if-eqz v1, :cond_0

    const-string v1, "Active"

    goto :goto_0

    :cond_0
    const-string v1, "New"

    .line 1312
    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ܽ()Z
    .locals 1

    .line 1310
    iget-boolean v0, p0, Ll/ܺ۬᩵;->᩸:Z

    return v0
.end method

.method public final ᩳ()Ll/᩻۫᩵;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method
