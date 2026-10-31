.class public final synthetic Ll/᩺ۤ᩷;
.super Ljava/lang/Object;
.source "31K1"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ᩸:Ll/֫ۛ᩷;


# direct methods
.method public synthetic constructor <init>(Ll/֫ۛ᩷;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩺ۤ᩷;->᩸:Ll/֫ۛ᩷;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    .line 1961
    iget-object p1, p0, Ll/᩺ۤ᩷;->᩸:Ll/֫ۛ᩷;

    iget-object p2, p1, Ll/֫ۛ᩷;->ۧ:Ll/ܳۛ᩷;

    iget-object v0, p1, Ll/֫ۛ᩷;->ᩳ:Ll/ܿۛ᩷;

    new-instance v1, Ll/۟ۤ᩷;

    invoke-direct {v1, p1}, Ll/۟ۤ᩷;-><init>(Ll/֫ۛ᩷;)V

    const/4 p1, 0x0

    invoke-virtual {p2, v0, p1, v1}, Ll/ܳۛ᩷;->֫(Ll/ܿۛ᩷;ZLjava/lang/Runnable;)V

    return-void
.end method
