.class public final Ll/ᩴۛۡ;
.super Ljava/lang/Object;
.source "91U1"

# interfaces
.implements Ll/ۖۛۡ;


# instance fields
.field public final ᩶:I

.field public ᩸:I

.field public final ᩹:Ll/ۘۛۡ;


# direct methods
.method public constructor <init>(Ll/ۘۛۡ;I)V
    .locals 0

    .line 189
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 190
    iput-object p1, p0, Ll/ᩴۛۡ;->᩹:Ll/ۘۛۡ;

    .line 191
    iput p2, p0, Ll/ᩴۛۡ;->᩶:I

    return-void
.end method


# virtual methods
.method public final ֫(I)V
    .locals 6

    .line 196
    iget v0, p0, Ll/ᩴۛۡ;->᩸:I

    if-eq v0, p1, :cond_1

    .line 197
    iput p1, p0, Ll/ᩴۛۡ;->᩸:I

    .line 124
    iget-object p1, p0, Ll/ᩴۛۡ;->᩹:Ll/ۘۛۡ;

    iget-object v0, p1, Ll/ۘۛۡ;->ܽ:[Ll/ᩴۛۡ;

    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v4, v0, v2

    .line 125
    iget v5, v4, Ll/ᩴۛۡ;->᩸:I

    iget v4, v4, Ll/ᩴۛۡ;->᩶:I

    mul-int v5, v5, v4

    add-int/2addr v3, v5

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 127
    :cond_0
    div-int/lit16 v3, v3, 0x2710

    .line 128
    iget v0, p1, Ll/ۘۛۡ;->ۧ:I

    if-eq v0, v3, :cond_1

    .line 129
    iput v3, p1, Ll/ۘۛۡ;->ۧ:I

    .line 130
    iget-object p1, p1, Ll/ۘۛۡ;->֫:Ll/ۖۛۡ;

    invoke-interface {p1, v3}, Ll/ۖۛۡ;->֫(I)V

    :cond_1
    return-void
.end method
