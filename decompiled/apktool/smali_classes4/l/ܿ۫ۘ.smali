.class public final Ll/ܿ۫ۘ;
.super Ljava/lang/Object;
.source "R2TM"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public ᩸:I

.field public final synthetic ᩹:Ll/ܳ۫ۘ;


# direct methods
.method public constructor <init>(Ll/ܳ۫ۘ;)V
    .locals 0

    .line 250
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܿ۫ۘ;->᩹:Ll/ܳ۫ۘ;

    const/4 p1, 0x0

    .line 251
    iput p1, p0, Ll/ܿ۫ۘ;->᩸:I

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 2

    .line 255
    iget v0, p0, Ll/ܿ۫ۘ;->᩸:I

    iget-object v1, p0, Ll/ܿ۫ۘ;->᩹:Ll/ܳ۫ۘ;

    invoke-static {v1}, Ll/ܳ۫ۘ;->֫(Ll/ܳ۫ۘ;)I

    move-result v1

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 5

    .line 260
    iget-object v0, p0, Ll/ܿ۫ۘ;->᩹:Ll/ܳ۫ۘ;

    iget-object v1, v0, Ll/ܳ۫ۘ;->᩶:[Ljava/lang/String;

    iget v2, p0, Ll/ܿ۫ۘ;->᩸:I

    aget-object v1, v1, v2

    .line 261
    new-instance v3, Ll/ᩳ۫ۘ;

    iget-object v4, v0, Ll/ܳ۫ۘ;->᩸:[Ljava/lang/String;

    aget-object v2, v4, v2

    if-nez v1, :cond_0

    const-string v1, ""

    :cond_0
    invoke-direct {v3, v2, v1, v0}, Ll/ᩳ۫ۘ;-><init>(Ljava/lang/String;Ljava/lang/String;Ll/ܳ۫ۘ;)V

    .line 262
    iget v0, p0, Ll/ܿ۫ۘ;->᩸:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/ܿ۫ۘ;->᩸:I

    return-object v3
.end method

.method public final remove()V
    .locals 2

    .line 268
    iget v0, p0, Ll/ܿ۫ۘ;->᩸:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Ll/ܿ۫ۘ;->᩸:I

    iget-object v1, p0, Ll/ܿ۫ۘ;->᩹:Ll/ܳ۫ۘ;

    invoke-static {v1, v0}, Ll/ܳ۫ۘ;->֫(Ll/ܳ۫ۘ;I)V

    return-void
.end method
