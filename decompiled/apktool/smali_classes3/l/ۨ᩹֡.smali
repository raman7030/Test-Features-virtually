.class public final Ll/ۨ᩹֡;
.super Ljava/lang/Object;
.source "04TC"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public final synthetic ۙ:Ll/ܰ᩹֡;

.field public final ᩶:I

.field public ᩸:I

.field public ᩹:Ll/᩺᩹֡;


# direct methods
.method public constructor <init>(Ll/ܰ᩹֡;)V
    .locals 0

    .line 147
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۨ᩹֡;->ۙ:Ll/ܰ᩹֡;

    .line 148
    invoke-virtual {p1}, Ll/ܰ᩹֡;->ۡ()I

    move-result p1

    iput p1, p0, Ll/ۨ᩹֡;->᩶:I

    const/4 p1, 0x0

    .line 149
    iput p1, p0, Ll/ۨ᩹֡;->᩸:I

    .line 151
    new-instance p1, Ll/᩺᩹֡;

    invoke-direct {p1}, Ll/᩺᩹֡;-><init>()V

    iput-object p1, p0, Ll/ۨ᩹֡;->᩹:Ll/᩺᩹֡;

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 2

    .line 154
    iget v0, p0, Ll/ۨ᩹֡;->᩸:I

    iget v1, p0, Ll/ۨ᩹֡;->᩶:I

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 3

    .line 158
    iget-object v0, p0, Ll/ۨ᩹֡;->ۙ:Ll/ܰ᩹֡;

    invoke-static {v0}, Ll/ܰ᩹֡;->֫(Ll/ܰ᩹֡;)[I

    move-result-object v1

    iget v2, p0, Ll/ۨ᩹֡;->᩸:I

    aget v1, v1, v2

    iget-object v2, p0, Ll/ۨ᩹֡;->᩹:Ll/᩺᩹֡;

    iput v1, v2, Ll/᩺᩹֡;->֫:I

    .line 159
    invoke-static {v0}, Ll/ܰ᩹֡;->ۧ(Ll/ܰ᩹֡;)[I

    move-result-object v0

    iget v1, p0, Ll/ۨ᩹֡;->᩸:I

    aget v0, v0, v1

    iput v0, v2, Ll/᩺᩹֡;->ۧ:I

    add-int/lit8 v1, v1, 0x1

    .line 160
    iput v1, p0, Ll/ۨ᩹֡;->᩸:I

    return-object v2
.end method

.method public final remove()V
    .locals 0

    return-void
.end method
