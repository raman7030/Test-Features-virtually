.class public final synthetic Ll/ܺ֨ܳ;
.super Ljava/lang/Object;
.source "Z17V"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ᩸:Ljava/lang/Runnable;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Runnable;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܺ֨ܳ;->᩸:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    .line 2
    iget-object p1, p0, Ll/ܺ֨ܳ;->᩸:Ljava/lang/Runnable;

    .line 77
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    return-void
.end method
