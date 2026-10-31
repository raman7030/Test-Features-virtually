.class public final synthetic Ll/ۢ᩹ܽ;
.super Ljava/lang/Object;
.source "P676"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ᩸:Ll/᩷᩶ܽ;


# direct methods
.method public synthetic constructor <init>(Ll/᩷᩶ܽ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۢ᩹ܽ;->᩸:Ll/᩷᩶ܽ;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    .line 2
    sget-boolean p1, Ll/᩷᩶ܽ;->ܺۧ:Z

    .line 274
    new-instance p1, Ll/۬᩹ܽ;

    iget-object p2, p0, Ll/ۢ᩹ܽ;->᩸:Ll/᩷᩶ܽ;

    const/4 v0, 0x1

    invoke-direct {p1, p2, v0}, Ll/۬᩹ܽ;-><init>(Ll/᩷᩶ܽ;Z)V

    .line 341
    invoke-virtual {p1}, Ll/۟ܶۡ;->᩻()V

    return-void
.end method
