.class public final Ll/ۨۘܺ;
.super Ljava/lang/Object;
.source "SBH8"

# interfaces
.implements Ll/ۜᩴܺ;


# instance fields
.field public ֫:I

.field public final synthetic ۧ:Ll/᩺ۘܺ;


# direct methods
.method public constructor <init>(Ll/᩺ۘܺ;)V
    .locals 1

    .line 121
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۨۘܺ;->ۧ:Ll/᩺ۘܺ;

    .line 122
    iget-object p1, p1, Ll/᩺ۘܺ;->֫:[I

    const/4 v0, 0x0

    invoke-static {v0, p1}, Ll/ܰۘܺ;->ۧ(I[I)I

    move-result p1

    iput p1, p0, Ll/ۨۘܺ;->֫:I

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 1

    .line 127
    iget v0, p0, Ll/ۨۘܺ;->֫:I

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final next()I
    .locals 3

    .line 133
    invoke-virtual {p0}, Ll/ۨۘܺ;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 137
    iget v0, p0, Ll/ۨۘܺ;->֫:I

    .line 139
    iget-object v1, p0, Ll/ۨۘܺ;->ۧ:Ll/᩺ۘܺ;

    iget-object v1, v1, Ll/᩺ۘܺ;->֫:[I

    add-int/lit8 v2, v0, 0x1

    invoke-static {v2, v1}, Ll/ܰۘܺ;->ۧ(I[I)I

    move-result v1

    iput v1, p0, Ll/ۨۘܺ;->֫:I

    return v0

    .line 134
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method
