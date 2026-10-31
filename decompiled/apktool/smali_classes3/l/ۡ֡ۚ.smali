.class public final Ll/ۡ֡ۚ;
.super Ljava/lang/Object;
.source "R2TM"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public ᩸:I

.field public final synthetic ᩹:Ll/ܺ֡ۚ;


# direct methods
.method public constructor <init>(Ll/ܺ֡ۚ;)V
    .locals 0

    .line 322
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۡ֡ۚ;->᩹:Ll/ܺ֡ۚ;

    const/4 p1, 0x0

    .line 323
    iput p1, p0, Ll/ۡ֡ۚ;->᩸:I

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 4

    .line 327
    :goto_0
    iget v0, p0, Ll/ۡ֡ۚ;->᩸:I

    iget-object v1, p0, Ll/ۡ֡ۚ;->᩹:Ll/ܺ֡ۚ;

    invoke-static {v1}, Ll/ܺ֡ۚ;->ۧ(Ll/ܺ֡ۚ;)I

    move-result v2

    const/4 v3, 0x1

    if-ge v0, v2, :cond_0

    .line 328
    iget-object v0, v1, Ll/ܺ֡ۚ;->᩸:[Ljava/lang/String;

    iget v2, p0, Ll/ۡ֡ۚ;->᩸:I

    aget-object v0, v0, v2

    invoke-static {v1, v0}, Ll/ܺ֡ۚ;->֫(Ll/ܺ֡ۚ;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 329
    iget v0, p0, Ll/ۡ֡ۚ;->᩸:I

    add-int/2addr v0, v3

    iput v0, p0, Ll/ۡ֡ۚ;->᩸:I

    goto :goto_0

    .line 334
    :cond_0
    iget v0, p0, Ll/ۡ֡ۚ;->᩸:I

    invoke-static {v1}, Ll/ܺ֡ۚ;->ۧ(Ll/ܺ֡ۚ;)I

    move-result v1

    if-ge v0, v1, :cond_1

    return v3

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 5

    .line 339
    new-instance v0, Ll/ۢ֡ۚ;

    iget-object v1, p0, Ll/ۡ֡ۚ;->᩹:Ll/ܺ֡ۚ;

    iget-object v2, v1, Ll/ܺ֡ۚ;->᩸:[Ljava/lang/String;

    iget v3, p0, Ll/ۡ֡ۚ;->᩸:I

    aget-object v2, v2, v3

    iget-object v4, v1, Ll/ܺ֡ۚ;->᩶:[Ljava/lang/Object;

    aget-object v3, v4, v3

    check-cast v3, Ljava/lang/String;

    invoke-direct {v0, v2, v3, v1}, Ll/ۢ֡ۚ;-><init>(Ljava/lang/String;Ljava/lang/String;Ll/ܺ֡ۚ;)V

    .line 340
    iget v1, p0, Ll/ۡ֡ۚ;->᩸:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Ll/ۡ֡ۚ;->᩸:I

    return-object v0
.end method

.method public final remove()V
    .locals 2

    .line 346
    iget v0, p0, Ll/ۡ֡ۚ;->᩸:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Ll/ۡ֡ۚ;->᩸:I

    iget-object v1, p0, Ll/ۡ֡ۚ;->᩹:Ll/ܺ֡ۚ;

    invoke-static {v1, v0}, Ll/ܺ֡ۚ;->֫(Ll/ܺ֡ۚ;I)V

    return-void
.end method
