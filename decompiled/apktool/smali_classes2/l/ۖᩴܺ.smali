.class public final Ll/ۖᩴܺ;
.super Ljava/lang/Object;
.source "FBI6"

# interfaces
.implements Ll/ۜᩴܺ;


# instance fields
.field public ֫:I

.field public final synthetic ۧ:Ll/ۘᩴܺ;


# direct methods
.method public constructor <init>(Ll/ۘᩴܺ;)V
    .locals 0

    .line 129
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۖᩴܺ;->ۧ:Ll/ۘᩴܺ;

    const/4 p1, 0x0

    .line 130
    iput p1, p0, Ll/ۖᩴܺ;->֫:I

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 2

    .line 135
    iget v0, p0, Ll/ۖᩴܺ;->֫:I

    iget-object v1, p0, Ll/ۖᩴܺ;->ۧ:Ll/ۘᩴܺ;

    iget-object v1, v1, Ll/ۘᩴܺ;->֫:Ll/᩷ᩴܺ;

    invoke-virtual {v1}, Ll/᩷ᩴܺ;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final next()I
    .locals 3

    .line 141
    invoke-virtual {p0}, Ll/ۖᩴܺ;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 145
    iget-object v0, p0, Ll/ۖᩴܺ;->ۧ:Ll/ۘᩴܺ;

    iget-object v0, v0, Ll/ۘᩴܺ;->֫:Ll/᩷ᩴܺ;

    iget v1, p0, Ll/ۖᩴܺ;->֫:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Ll/ۖᩴܺ;->֫:I

    invoke-virtual {v0, v1}, Ll/᩷ᩴܺ;->get(I)I

    move-result v0

    return v0

    .line 142
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method
