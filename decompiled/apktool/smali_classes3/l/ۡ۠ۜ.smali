.class public final synthetic Ll/ۡ۠ۜ;
.super Ljava/lang/Object;
.source "474R"

# interfaces
.implements Ll/ۛ֡ۜ;


# instance fields
.field public final synthetic ֫:Ll/ܿۗۜ;

.field public final synthetic ۧ:Landroid/net/Uri;

.field public final synthetic ܽ:Ljava/lang/String;

.field public final synthetic ᩳ:J


# direct methods
.method public synthetic constructor <init>(Ll/ܿۗۜ;Landroid/net/Uri;Ljava/lang/String;J)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۡ۠ۜ;->֫:Ll/ܿۗۜ;

    iput-object p2, p0, Ll/ۡ۠ۜ;->ۧ:Landroid/net/Uri;

    iput-object p3, p0, Ll/ۡ۠ۜ;->ܽ:Ljava/lang/String;

    iput-wide p4, p0, Ll/ۡ۠ۜ;->ᩳ:J

    return-void
.end method


# virtual methods
.method public final ֫()Ll/۟ܰۜ;
    .locals 7

    .line 83
    new-instance v6, Ll/ۙ᩶ۜ;

    iget-object v1, p0, Ll/ۡ۠ۜ;->֫:Ll/ܿۗۜ;

    iget-object v2, p0, Ll/ۡ۠ۜ;->ۧ:Landroid/net/Uri;

    iget-object v3, p0, Ll/ۡ۠ۜ;->ܽ:Ljava/lang/String;

    iget-wide v4, p0, Ll/ۡ۠ۜ;->ᩳ:J

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Ll/ۙ᩶ۜ;-><init>(Ll/ܿۗۜ;Landroid/net/Uri;Ljava/lang/String;J)V

    return-object v6
.end method
