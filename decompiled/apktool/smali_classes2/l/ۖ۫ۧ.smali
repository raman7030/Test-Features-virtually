.class public final Ll/ۖ۫ۧ;
.super Ljava/lang/Object;
.source "V5QL"


# instance fields
.field public ֫:Ll/ۡ۫ۧ;

.field public final ۧ:Ll/ܺ۫ۧ;


# direct methods
.method public constructor <init>(Ll/ܺ۫ۧ;)V
    .locals 1

    .line 131
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 132
    iput-object p1, p0, Ll/ۖ۫ۧ;->ۧ:Ll/ܺ۫ۧ;

    .line 133
    new-instance p1, Ll/ۡ۫ۧ;

    .line 136
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 137
    iput v0, p1, Ll/ۡ۫ۧ;->֫:I

    .line 133
    iput-object p1, p0, Ll/ۖ۫ۧ;->֫:Ll/ۡ۫ۧ;

    return-void
.end method


# virtual methods
.method public final ֫(IIII)Landroid/view/View;
    .locals 9

    .line 213
    iget-object v0, p0, Ll/ۖ۫ۧ;->ۧ:Ll/ܺ۫ۧ;

    invoke-interface {v0}, Ll/ܺ۫ۧ;->֫()I

    move-result v1

    .line 214
    invoke-interface {v0}, Ll/ܺ۫ۧ;->ۧ()I

    move-result v2

    if-le p2, p1, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, -0x1

    :goto_0
    const/4 v4, 0x0

    :goto_1
    if-eq p1, p2, :cond_3

    .line 218
    invoke-interface {v0, p1}, Ll/ܺ۫ۧ;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    .line 219
    invoke-interface {v0, v5}, Ll/ܺ۫ۧ;->֫(Landroid/view/View;)I

    move-result v6

    .line 220
    invoke-interface {v0, v5}, Ll/ܺ۫ۧ;->ۧ(Landroid/view/View;)I

    move-result v7

    .line 141
    iget-object v8, p0, Ll/ۖ۫ۧ;->֫:Ll/ۡ۫ۧ;

    iput v1, v8, Ll/ۡ۫ۧ;->ܿ:I

    .line 142
    iput v2, v8, Ll/ۡ۫ۧ;->ᩳ:I

    .line 143
    iput v6, v8, Ll/ۡ۫ۧ;->ܽ:I

    .line 144
    iput v7, v8, Ll/ۡ۫ۧ;->ۧ:I

    if-eqz p3, :cond_1

    .line 148
    iput p3, v8, Ll/ۡ۫ۧ;->֫:I

    .line 225
    invoke-virtual {v8}, Ll/ۡ۫ۧ;->֫()Z

    move-result v6

    if-eqz v6, :cond_1

    return-object v5

    :cond_1
    if-eqz p4, :cond_2

    .line 148
    iput p4, v8, Ll/ۡ۫ۧ;->֫:I

    .line 233
    invoke-virtual {v8}, Ll/ۡ۫ۧ;->֫()Z

    move-result v6

    if-eqz v6, :cond_2

    move-object v4, v5

    :cond_2
    add-int/2addr p1, v3

    goto :goto_1

    :cond_3
    return-object v4
.end method

.method public final ֫(Landroid/view/View;)Z
    .locals 4

    .line 248
    iget-object v0, p0, Ll/ۖ۫ۧ;->ۧ:Ll/ܺ۫ۧ;

    invoke-interface {v0}, Ll/ܺ۫ۧ;->֫()I

    move-result v1

    invoke-interface {v0}, Ll/ܺ۫ۧ;->ۧ()I

    move-result v2

    .line 249
    invoke-interface {v0, p1}, Ll/ܺ۫ۧ;->֫(Landroid/view/View;)I

    move-result v3

    invoke-interface {v0, p1}, Ll/ܺ۫ۧ;->ۧ(Landroid/view/View;)I

    move-result p1

    .line 141
    iget-object v0, p0, Ll/ۖ۫ۧ;->֫:Ll/ۡ۫ۧ;

    iput v1, v0, Ll/ۡ۫ۧ;->ܿ:I

    .line 142
    iput v2, v0, Ll/ۡ۫ۧ;->ᩳ:I

    .line 143
    iput v3, v0, Ll/ۡ۫ۧ;->ܽ:I

    .line 144
    iput p1, v0, Ll/ۡ۫ۧ;->ۧ:I

    const/16 p1, 0x6003

    .line 148
    iput p1, v0, Ll/ۡ۫ۧ;->֫:I

    .line 253
    invoke-virtual {v0}, Ll/ۡ۫ۧ;->֫()Z

    move-result p1

    return p1
.end method
