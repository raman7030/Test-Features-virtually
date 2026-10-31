.class public abstract Ll/֨᩶ܺ;
.super Ll/᩶ۨܺ;
.source "Q64S"


# instance fields
.field public ᩸:Ljava/lang/Object;

.field public ᩹:Ll/ۚ᩶ܺ;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 69
    invoke-direct {p0}, Ll/᩶ۨܺ;-><init>()V

    .line 66
    sget-object v0, Ll/ۚ᩶ܺ;->ۙ:Ll/ۚ᩶ܺ;

    iput-object v0, p0, Ll/֨᩶ܺ;->᩹:Ll/ۚ᩶ܺ;

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 5

    .line 128
    iget-object v0, p0, Ll/֨᩶ܺ;->᩹:Ll/ۚ᩶ܺ;

    sget-object v1, Ll/ۚ᩶ܺ;->᩶:Ll/ۚ᩶ܺ;

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ll/ۘܶܺ;->ۧ(Z)V

    .line 129
    iget-object v0, p0, Ll/֨᩶ܺ;->᩹:Ll/ۚ᩶ܺ;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    if-eqz v0, :cond_2

    const/4 v4, 0x2

    if-eq v0, v4, :cond_1

    .line 140
    iput-object v1, p0, Ll/֨᩶ܺ;->᩹:Ll/ۚ᩶ܺ;

    .line 141
    invoke-virtual {p0}, Ll/֨᩶ܺ;->֫()Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Ll/֨᩶ܺ;->᩸:Ljava/lang/Object;

    .line 142
    iget-object v0, p0, Ll/֨᩶ܺ;->᩹:Ll/ۚ᩶ܺ;

    sget-object v1, Ll/ۚ᩶ܺ;->᩹:Ll/ۚ᩶ܺ;

    if-eq v0, v1, :cond_1

    .line 143
    sget-object v0, Ll/ۚ᩶ܺ;->ۗ:Ll/ۚ᩶ܺ;

    iput-object v0, p0, Ll/֨᩶ܺ;->᩹:Ll/ۚ᩶ܺ;

    return v3

    :cond_1
    return v2

    :cond_2
    return v3
.end method

.method public final next()Ljava/lang/Object;
    .locals 2

    .line 153
    invoke-virtual {p0}, Ll/֨᩶ܺ;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 156
    sget-object v0, Ll/ۚ᩶ܺ;->ۙ:Ll/ۚ᩶ܺ;

    iput-object v0, p0, Ll/֨᩶ܺ;->᩹:Ll/ۚ᩶ܺ;

    .line 158
    iget-object v0, p0, Ll/֨᩶ܺ;->᩸:Ljava/lang/Object;

    const/4 v1, 0x0

    .line 159
    iput-object v1, p0, Ll/֨᩶ܺ;->᩸:Ljava/lang/Object;

    return-object v0

    .line 154
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public abstract ֫()Ljava/lang/Object;
.end method

.method public final ۧ()V
    .locals 1

    .line 122
    sget-object v0, Ll/ۚ᩶ܺ;->᩹:Ll/ۚ᩶ܺ;

    iput-object v0, p0, Ll/֨᩶ܺ;->᩹:Ll/ۚ᩶ܺ;

    return-void
.end method
