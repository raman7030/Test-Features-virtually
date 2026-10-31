.class public final Ll/ۡۖ֨;
.super Ljava/lang/Object;
.source "P3JQ"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public ᩸:Ll/ۘۖ֨;


# direct methods
.method public constructor <init>(Ll/ۘۖ֨;)V
    .locals 0

    .line 146
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 167
    iput-object p1, p0, Ll/ۡۖ֨;->᩸:Ll/ۘۖ֨;

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 1

    .line 149
    iget-object v0, p0, Ll/ۡۖ֨;->᩸:Ll/ۘۖ֨;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 2

    .line 154
    iget-object v0, p0, Ll/ۡۖ֨;->᩸:Ll/ۘۖ֨;

    if-eqz v0, :cond_0

    .line 157
    invoke-static {v0}, Ll/ۘۖ֨;->֫(Ll/ۘۖ֨;)Ll/۬ܺ֨;

    move-result-object v0

    .line 158
    iget-object v1, p0, Ll/ۡۖ֨;->᩸:Ll/ۘۖ֨;

    invoke-static {v1}, Ll/ۘۖ֨;->ۧ(Ll/ۘۖ֨;)Ll/ۘۖ֨;

    move-result-object v1

    iput-object v1, p0, Ll/ۡۖ֨;->᩸:Ll/ۘۖ֨;

    return-object v0

    .line 155
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final remove()V
    .locals 1

    .line 164
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method
