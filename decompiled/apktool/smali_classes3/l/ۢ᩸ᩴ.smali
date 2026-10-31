.class public final Ll/ۢ᩸ᩴ;
.super Ljava/lang/Object;
.source "N673"


# instance fields
.field public final a:Ll/᩷۠ᩴ;

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/nio/file/DirectoryStream;

.field public final d:Ljava/util/Iterator;

.field public e:Z


# direct methods
.method public constructor <init>(Ll/᩷۠ᩴ;Ljava/lang/Object;Ljava/nio/file/DirectoryStream;)V
    .locals 0

    .line 74
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 75
    iput-object p1, p0, Ll/ۢ᩸ᩴ;->a:Ll/᩷۠ᩴ;

    .line 76
    iput-object p2, p0, Ll/ۢ᩸ᩴ;->b:Ljava/lang/Object;

    .line 77
    iput-object p3, p0, Ll/ۢ᩸ᩴ;->c:Ljava/nio/file/DirectoryStream;

    .line 78
    invoke-interface {p3}, Ljava/nio/file/DirectoryStream;->iterator()Ljava/util/Iterator;

    move-result-object p1

    iput-object p1, p0, Ll/ۢ᩸ᩴ;->d:Ljava/util/Iterator;

    return-void
.end method
