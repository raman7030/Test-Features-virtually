.class public final synthetic Ll/۠᩻ۢ;
.super Ljava/lang/Object;
.source "E1KB"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ᩸:Ll/ܶ᩻ۢ;

.field public final synthetic ᩹:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ll/ܶ᩻ۢ;Ljava/lang/String;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۠᩻ۢ;->᩸:Ll/ܶ᩻ۢ;

    iput-object p2, p0, Ll/۠᩻ۢ;->᩹:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    .line 326
    iget-object p1, p0, Ll/۠᩻ۢ;->᩸:Ll/ܶ᩻ۢ;

    iget-object p1, p1, Ll/ܶ᩻ۢ;->ۙ:Ll/᩸᩻ۢ;

    invoke-static {p1}, Ll/᩸᩻ۢ;->ܽ(Ll/᩸᩻ۢ;)Ll/۫ۧۢ;

    move-result-object p1

    iget-object p2, p0, Ll/۠᩻ۢ;->᩹:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ll/۫ۧۢ;->᩵(Ljava/lang/String;)V

    return-void
.end method
