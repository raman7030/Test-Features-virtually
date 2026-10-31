.class public final Ll/ۗ۫ۡ;
.super Ljava/lang/Object;
.source "Z3WU"


# static fields
.field public static final ֫:Ll/ۧ֫֡;


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    .line 43
    new-instance v0, Ljava/io/File;

    invoke-static {}, Ll/ۙ᩸᩷;->ܽ()Ljava/io/File;

    move-result-object v1

    const-string v2, "thumbnail"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 45
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    const/4 v1, 0x1

    const-wide/32 v2, 0x1400000

    const/4 v4, 0x0

    .line 46
    invoke-static {v0, v4, v1, v2, v3}, Ll/ۧ֫֡;->֫(Ljava/io/File;IIJ)Ll/ۧ֫֡;

    move-result-object v0

    .line 40
    sput-object v0, Ll/ۗ۫ۡ;->֫:Ll/ۧ֫֡;

    return-void
.end method
