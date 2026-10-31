.class public final synthetic Ll/ۜ᩸ۜ;
.super Ljava/lang/Object;
.source "H74N"

# interfaces
.implements Ll/ۛ֡ۜ;


# instance fields
.field public final synthetic ֫:Landroid/media/MediaDataSource;

.field public final synthetic ۧ:J

.field public final synthetic ܽ:Ll/ۡ᩸ۜ;


# direct methods
.method public synthetic constructor <init>(Landroid/media/MediaDataSource;JLl/ۡ᩸ۜ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۜ᩸ۜ;->֫:Landroid/media/MediaDataSource;

    iput-wide p2, p0, Ll/ۜ᩸ۜ;->ۧ:J

    iput-object p4, p0, Ll/ۜ᩸ۜ;->ܽ:Ll/ۡ᩸ۜ;

    return-void
.end method


# virtual methods
.method public final ֫()Ll/۟ܰۜ;
    .locals 5

    .line 2
    iget-object v0, p0, Ll/ۜ᩸ۜ;->֫:Landroid/media/MediaDataSource;

    .line 228
    new-instance v1, Ll/ۘ᩸ۜ;

    iget-wide v2, p0, Ll/ۜ᩸ۜ;->ۧ:J

    iget-object v4, p0, Ll/ۜ᩸ۜ;->ܽ:Ll/ۡ᩸ۜ;

    invoke-direct {v1, v0, v2, v3, v4}, Ll/ۘ᩸ۜ;-><init>(Landroid/media/MediaDataSource;JLl/ۡ᩸ۜ;)V

    return-object v1
.end method
