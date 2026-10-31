.class public final synthetic Ll/֨ۖᩳ;
.super Ljava/lang/Object;
.source "Q649"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ᩸:Ll/۠ۖᩳ;

.field public final synthetic ᩹:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ll/۠ۖᩳ;Ljava/lang/String;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֨ۖᩳ;->᩸:Ll/۠ۖᩳ;

    iput-object p2, p0, Ll/֨ۖᩳ;->᩹:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    .line 2
    iget-object p1, p0, Ll/֨ۖᩳ;->᩹:Ljava/lang/String;

    .line 170
    iget-object p2, p0, Ll/֨ۖᩳ;->᩸:Ll/۠ۖᩳ;

    iget-object p2, p2, Ll/۠ۖᩳ;->᩷:Ll/ܶۖᩳ;

    invoke-static {p2, p1}, Lbin/mt/plus/Main;->֫(Landroid/app/Activity;Ljava/lang/String;)V

    return-void
.end method
