.class public final synthetic Ll/֫ۜ᩻;
.super Ljava/lang/Object;
.source "D9TI"

# interfaces
.implements Ll/ۙ۫ۡ;


# instance fields
.field public final synthetic ᩸:Ll/ᩳۜ᩻;

.field public final synthetic ᩹:Ll/ᩳۜܳ;


# direct methods
.method public synthetic constructor <init>(Ll/ᩳۜ᩻;Ll/ᩳۜܳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֫ۜ᩻;->᩸:Ll/ᩳۜ᩻;

    iput-object p2, p0, Ll/֫ۜ᩻;->᩹:Ll/ᩳۜܳ;

    return-void
.end method


# virtual methods
.method public final ֫()Landroid/graphics/Bitmap;
    .locals 5

    .line 2
    iget-object v0, p0, Ll/֫ۜ᩻;->᩸:Ll/ᩳۜ᩻;

    .line 4
    iget-object v1, p0, Ll/֫ۜ᩻;->᩹:Ll/ᩳۜܳ;

    .line 254
    sget-object v2, Ll/ܽ֡ܿ;->ۜ:Ll/ܶ᩵ܿ;

    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->ᩴ֫()Ll/ܶ᩵ܿ;

    move-result-object v2

    .line 255
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 257
    :try_start_0
    new-instance v4, Ll/ܽۜ᩻;

    invoke-direct {v4, v0, v3, v1, v2}, Ll/ܽۜ᩻;-><init>(Ll/ᩳۜ᩻;Ljava/util/ArrayList;Ll/ᩳۜܳ;Ll/ܶ᩵ܿ;)V

    invoke-static {v4}, Ll/ܿܺۡ;->֫(Ll/ۧܺۡ;)Landroid/graphics/Bitmap;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 274
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/io/InputStream;

    .line 275
    invoke-static {v3}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    goto :goto_0

    .line 277
    :cond_0
    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->۬()Z

    return-object v0

    :catchall_0
    move-exception v0

    .line 274
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/io/InputStream;

    .line 275
    invoke-static {v3}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    goto :goto_1

    .line 277
    :cond_1
    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->۬()Z

    .line 278
    throw v0
.end method
