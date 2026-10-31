.class public final synthetic Ll/᩵ۗ᩷;
.super Ljava/lang/Object;
.source "Z3WS"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ᩶:Ljava/util/ArrayList;

.field public final synthetic ᩸:Ll/ۗܺ᩷;

.field public final synthetic ᩹:Ll/۟᩵ۡ;


# direct methods
.method public synthetic constructor <init>(Ll/ۚۗ᩷;Ll/ۗܺ᩷;Ll/۟᩵ۡ;Ljava/util/ArrayList;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Ll/᩵ۗ᩷;->᩸:Ll/ۗܺ᩷;

    iput-object p3, p0, Ll/᩵ۗ᩷;->᩹:Ll/۟᩵ۡ;

    iput-object p4, p0, Ll/᩵ۗ᩷;->᩶:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    .line 272
    new-instance p1, Ll/᩸ۗ᩷;

    iget-object p2, p0, Ll/᩵ۗ᩷;->᩸:Ll/ۗܺ᩷;

    iget-object v0, p0, Ll/᩵ۗ᩷;->᩶:Ljava/util/ArrayList;

    iget-object v1, p0, Ll/᩵ۗ᩷;->᩹:Ll/۟᩵ۡ;

    invoke-direct {p1, p2, v0, v1}, Ll/᩸ۗ᩷;-><init>(Ll/ۗܺ᩷;Ljava/util/ArrayList;Ll/۟᩵ۡ;)V

    .line 311
    invoke-virtual {p1}, Ll/۟ܶۡ;->᩻()V

    return-void
.end method
