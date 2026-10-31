.class public final Ll/ۚ۟ۧ;
.super Ljava/lang/Object;
.source "J71Y"


# instance fields
.field public final ֫:Ljava/lang/String;

.field public final ۧ:Ll/֡۟ۧ;

.field public final ܽ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ll/֡۟ۧ;)V
    .locals 2

    .line 411
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 412
    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x2f

    if-ne v0, v1, :cond_1

    const-string v0, "/"

    .line 415
    invoke-virtual {p2, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 418
    iput-object p1, p0, Ll/ۚ۟ۧ;->֫:Ljava/lang/String;

    .line 419
    iput-object p2, p0, Ll/ۚ۟ۧ;->ܽ:Ljava/lang/String;

    .line 421
    iput-object p3, p0, Ll/ۚ۟ۧ;->ۧ:Ll/֡۟ۧ;

    return-void

    .line 416
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Path should end with a slash \'/\'"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 413
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Path should start with a slash \'/\'."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
