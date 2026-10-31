.class public final synthetic Ll/ܳ᩸ۜ;
.super Ljava/lang/Object;
.source "H74N"

# interfaces
.implements Ll/ۛ֡ۜ;


# instance fields
.field public final synthetic ֫:Ll/۫֡ۜ;

.field public final synthetic ۧ:Ll/ۡ᩸ۜ;


# direct methods
.method public synthetic constructor <init>(Ll/۫֡ۜ;Ll/ۡ᩸ۜ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܳ᩸ۜ;->֫:Ll/۫֡ۜ;

    iput-object p2, p0, Ll/ܳ᩸ۜ;->ۧ:Ll/ۡ᩸ۜ;

    return-void
.end method


# virtual methods
.method public final ֫()Ll/۟ܰۜ;
    .locals 3

    .line 2
    iget-object v0, p0, Ll/ܳ᩸ۜ;->֫:Ll/۫֡ۜ;

    .line 4
    iget-object v1, p0, Ll/ܳ᩸ۜ;->ۧ:Ll/ۡ᩸ۜ;

    .line 307
    :try_start_0
    invoke-virtual {v0}, Ll/۫֡ۜ;->ۡ()Ll/۟ܰۜ;

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v0, :cond_0

    .line 315
    new-instance v2, Ll/ۖ᩸ۜ;

    invoke-direct {v2, v0, v1}, Ll/ۖ᩸ۜ;-><init>(Ll/۟ܰۜ;Ll/ۡ᩸ۜ;)V

    return-object v2

    .line 313
    :cond_0
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Missing MPEG-TS thumbnail read handle"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :catch_0
    move-exception v0

    .line 309
    invoke-static {v1}, Ll/ۡ᩸ۜ;->ۧ(Ll/ۡ᩸ۜ;)V

    .line 310
    new-instance v1, Ll/ܺ᩸ۜ;

    invoke-direct {v1, v0}, Ll/ܺ᩸ۜ;-><init>(Ljava/io/IOException;)V

    throw v1
.end method
