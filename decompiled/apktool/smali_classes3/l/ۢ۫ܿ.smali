.class public final synthetic Ll/ۢ۫ܿ;
.super Ljava/lang/Object;
.source "G7AW"

# interfaces
.implements Landroid/content/DialogInterface$OnDismissListener;


# instance fields
.field public final synthetic ۙ:Ll/ۗܺ᩷;

.field public final synthetic ᩶:[Ljava/lang/Runnable;

.field public final synthetic ᩸:[Z

.field public final synthetic ᩹:Ll/᩹۫ܿ;


# direct methods
.method public synthetic constructor <init>([ZLl/᩹۫ܿ;[Ljava/lang/Runnable;Ll/ۗܺ᩷;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۢ۫ܿ;->᩸:[Z

    iput-object p2, p0, Ll/ۢ۫ܿ;->᩹:Ll/᩹۫ܿ;

    iput-object p3, p0, Ll/ۢ۫ܿ;->᩶:[Ljava/lang/Runnable;

    iput-object p4, p0, Ll/ۢ۫ܿ;->ۙ:Ll/ۗܺ᩷;

    return-void
.end method


# virtual methods
.method public final onDismiss(Landroid/content/DialogInterface;)V
    .locals 3

    .line 0
    iget-object p1, p0, Ll/ۢ۫ܿ;->᩶:[Ljava/lang/Runnable;

    iget-object v0, p0, Ll/ۢ۫ܿ;->ۙ:Ll/ۗܺ᩷;

    iget-object v1, p0, Ll/ۢ۫ܿ;->᩸:[Z

    iget-object v2, p0, Ll/ۢ۫ܿ;->᩹:Ll/᩹۫ܿ;

    invoke-static {v1, v2, p1, v0}, Ll/᩸۫ܿ;->֫([ZLl/᩹۫ܿ;[Ljava/lang/Runnable;Ll/ۗܺ᩷;)V

    return-void
.end method
