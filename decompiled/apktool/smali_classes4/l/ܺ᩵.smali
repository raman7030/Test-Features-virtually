.class public final Ll/ܺ᩵;
.super Ll/ۙ᩵;
.source "J5WP"


# instance fields
.field public final synthetic ᩳ:Ll/ۖ᩵;


# direct methods
.method public constructor <init>(Ll/ۖ᩵;)V
    .locals 0

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 76
    iput-object p1, p0, Ll/ܺ᩵;->ᩳ:Ll/ۖ᩵;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/Object;)I
    .locals 1

    .line 89
    iget-object v0, p0, Ll/ܺ᩵;->ᩳ:Ll/ۖ᩵;

    invoke-virtual {v0, p1}, Ll/ۗ᩵;->֫(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public final ֫(II)Ljava/lang/Object;
    .locals 1

    .line 84
    iget-object v0, p0, Ll/ܺ᩵;->ᩳ:Ll/ۖ᩵;

    iget-object v0, v0, Ll/ۗ᩵;->᩸:[Ljava/lang/Object;

    shl-int/lit8 p1, p1, 0x1

    add-int/2addr p1, p2

    aget-object p1, v0, p1

    return-object p1
.end method

.method public final ֫(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 2

    shl-int/lit8 p1, p1, 0x1

    add-int/lit8 p1, p1, 0x1

    .line 410
    iget-object v0, p0, Ll/ܺ᩵;->ᩳ:Ll/ۖ᩵;

    iget-object v0, v0, Ll/ۗ᩵;->᩸:[Ljava/lang/Object;

    aget-object v1, v0, p1

    .line 411
    aput-object p2, v0, p1

    return-object v1
.end method

.method public final ֫()V
    .locals 1

    .line 119
    iget-object v0, p0, Ll/ܺ᩵;->ᩳ:Ll/ۖ᩵;

    invoke-virtual {v0}, Ll/ۗ᩵;->clear()V

    return-void
.end method

.method public final ֫(I)V
    .locals 1

    .line 114
    iget-object v0, p0, Ll/ܺ᩵;->ᩳ:Ll/ۖ᩵;

    invoke-virtual {v0, p1}, Ll/ۗ᩵;->ܿ(I)Ljava/lang/Object;

    return-void
.end method

.method public final ֫(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .line 104
    iget-object v0, p0, Ll/ܺ᩵;->ᩳ:Ll/ۖ᩵;

    invoke-virtual {v0, p1, p2}, Ll/ۗ᩵;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final ۧ(Ljava/lang/Object;)I
    .locals 1

    .line 94
    iget-object v0, p0, Ll/ܺ᩵;->ᩳ:Ll/ۖ᩵;

    invoke-virtual {v0, p1}, Ll/ۗ᩵;->ۧ(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public final ۧ()Ljava/util/Map;
    .locals 1

    .line 99
    iget-object v0, p0, Ll/ܺ᩵;->ᩳ:Ll/ۖ᩵;

    return-object v0
.end method

.method public final ܽ()I
    .locals 1

    .line 79
    iget-object v0, p0, Ll/ܺ᩵;->ᩳ:Ll/ۖ᩵;

    iget v0, v0, Ll/ۗ᩵;->᩶:I

    return v0
.end method
