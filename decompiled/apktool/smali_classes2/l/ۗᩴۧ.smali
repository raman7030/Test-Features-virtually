.class public final Ll/ۗᩴۧ;
.super Ljava/lang/Object;
.source "K8I6"

# interfaces
.implements Ll/ܰۘۧ;


# instance fields
.field public final ᩸:Ljava/util/List;


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 0

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    iput-object p1, p0, Ll/ۗᩴۧ;->᩸:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final ֫(J)I
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-gez v2, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 p1, -0x1

    return p1
.end method

.method public final ֫(I)J
    .locals 2

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 49
    :goto_0
    invoke-static {p1}, Ll/᩺֡֫;->֫(Z)V

    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public final ܽ(J)Ljava/util/List;
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-ltz v2, :cond_0

    .line 55
    iget-object p1, p0, Ll/ۗᩴۧ;->᩸:Ljava/util/List;

    return-object p1

    :cond_0
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object p1
.end method
