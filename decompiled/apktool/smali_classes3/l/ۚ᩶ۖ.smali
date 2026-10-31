.class public abstract Ll/ۚ᩶ۖ;
.super Ll/۠᩶ۖ;
.source "N65V"


# instance fields
.field public ۗ:[Ll/۠᩶ۖ;


# direct methods
.method public constructor <init>(Ll/֨᩶ۖ;[Ll/۠᩶ۖ;)V
    .locals 1

    .line 141
    sget-object v0, Ll/֡᩹ۖ;->ۗ:Ll/֡᩹ۖ;

    invoke-direct {p0, p1, v0}, Ll/۠᩶ۖ;-><init>(Ll/֨᩶ۖ;Ll/֡᩹ۖ;)V

    .line 142
    iput-object p2, p0, Ll/ۚ᩶ۖ;->ۗ:[Ll/۠᩶ۖ;

    return-void
.end method


# virtual methods
.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 132
    invoke-super {p0}, Ll/۠᩶ۖ;->clone()Ll/۠᩶ۖ;

    move-result-object v0

    return-object v0
.end method

.method public final ֫([Ll/۠᩶ۖ;)V
    .locals 0

    .line 137
    iput-object p1, p0, Ll/ۚ᩶ۖ;->ۗ:[Ll/۠᩶ۖ;

    return-void
.end method

.method public final ۜ()[Ll/۠᩶ۖ;
    .locals 4

    .line 146
    iget-object v0, p0, Ll/ۚ᩶ۖ;->ۗ:[Ll/۠᩶ۖ;

    array-length v0, v0

    new-array v1, v0, [Ll/۠᩶ۖ;

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    .line 148
    iget-object v3, p0, Ll/ۚ᩶ۖ;->ۗ:[Ll/۠᩶ۖ;

    aget-object v3, v3, v2

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v3}, Ll/۠᩶ۖ;->clone()Ll/۠᩶ۖ;

    move-result-object v3

    aput-object v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method public final ۧ(Ll/֨᩹ۖ;)[Ll/۠᩶ۖ;
    .locals 4

    .line 153
    iget-object v0, p0, Ll/ۚ᩶ۖ;->ۗ:[Ll/۠᩶ۖ;

    array-length v0, v0

    new-array v1, v0, [Ll/۠᩶ۖ;

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    .line 155
    iget-object v3, p0, Ll/ۚ᩶ۖ;->ۗ:[Ll/۠᩶ۖ;

    aget-object v3, v3, v2

    invoke-virtual {v3, p1}, Ll/۠᩶ۖ;->֫(Ll/֨᩹ۖ;)Ll/۠᩶ۖ;

    move-result-object v3

    aput-object v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method public final ܿ()[Ll/۠᩶ۖ;
    .locals 1

    .line 162
    iget-object v0, p0, Ll/ۚ᩶ۖ;->ۗ:[Ll/۠᩶ۖ;

    return-object v0
.end method
