.class public Ll/ᩴᩴܺ;
.super Ljava/lang/Object;
.source "RBGH"


# instance fields
.field public ᩸:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 35
    iput-boolean v0, p0, Ll/ᩴᩴܺ;->᩸:Z

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 0

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    iput-boolean p1, p0, Ll/ᩴᩴܺ;->᩸:Z

    return-void
.end method


# virtual methods
.method public final ֡()V
    .locals 3

    .line 87
    iget-boolean v0, p0, Ll/ᩴᩴܺ;->᩸:Z

    if-nez v0, :cond_0

    return-void

    .line 88
    :cond_0
    new-instance v0, Ll/᩵ᩴܺ;

    const-string v1, "mutable instance"

    const/4 v2, 0x0

    .line 60
    invoke-direct {v0, v1, v2}, Ll/۠ۧܺ;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 88
    throw v0
.end method

.method public final ۧ()Z
    .locals 1

    .line 70
    iget-boolean v0, p0, Ll/ᩴᩴܺ;->᩸:Z

    return v0
.end method

.method public ܺ()V
    .locals 1

    const/4 v0, 0x0

    .line 51
    iput-boolean v0, p0, Ll/ᩴᩴܺ;->᩸:Z

    return-void
.end method

.method public final ᩴ()V
    .locals 3

    .line 78
    iget-boolean v0, p0, Ll/ᩴᩴܺ;->᩸:Z

    if-eqz v0, :cond_0

    return-void

    .line 79
    :cond_0
    new-instance v0, Ll/᩵ᩴܺ;

    const-string v1, "immutable instance"

    const/4 v2, 0x0

    .line 60
    invoke-direct {v0, v1, v2}, Ll/۠ۧܺ;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 79
    throw v0
.end method

.method public final ᩻()Z
    .locals 1

    .line 61
    iget-boolean v0, p0, Ll/ᩴᩴܺ;->᩸:Z

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method
