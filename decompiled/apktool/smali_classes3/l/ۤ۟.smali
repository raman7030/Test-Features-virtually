.class public final Ll/ۤ۟;
.super Ljava/lang/Object;
.source "23DC"

# interfaces
.implements Ll/ۛ۟;


# instance fields
.field public final ֫:Landroid/net/Uri;

.field public final ۧ:Landroid/content/ClipDescription;

.field public final ܽ:Landroid/net/Uri;


# direct methods
.method public constructor <init>(Landroid/net/Uri;Landroid/content/ClipDescription;Landroid/net/Uri;)V
    .locals 0

    .line 62
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 63
    iput-object p1, p0, Ll/ۤ۟;->֫:Landroid/net/Uri;

    .line 64
    iput-object p2, p0, Ll/ۤ۟;->ۧ:Landroid/content/ClipDescription;

    .line 65
    iput-object p3, p0, Ll/ۤ۟;->ܽ:Landroid/net/Uri;

    return-void
.end method


# virtual methods
.method public final getDescription()Landroid/content/ClipDescription;
    .locals 1

    .line 77
    iget-object v0, p0, Ll/ۤ۟;->ۧ:Landroid/content/ClipDescription;

    return-object v0
.end method

.method public final ֫()Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final ۧ()Landroid/net/Uri;
    .locals 1

    .line 71
    iget-object v0, p0, Ll/ۤ۟;->֫:Landroid/net/Uri;

    return-object v0
.end method

.method public final ܽ()V
    .locals 0

    return-void
.end method

.method public final ᩳ()Landroid/net/Uri;
    .locals 1

    .line 83
    iget-object v0, p0, Ll/ۤ۟;->ܽ:Landroid/net/Uri;

    return-object v0
.end method
