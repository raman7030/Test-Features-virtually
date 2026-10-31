.class public final synthetic Ll/ۚܿܿ;
.super Ljava/lang/Object;
.source "4AWI"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ᩸:Ll/֡ܳܿ;

.field public final synthetic ᩹:Ll/᩻ܳܿ;


# direct methods
.method public synthetic constructor <init>(Ll/֡ܳܿ;Ll/᩻ܳܿ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۚܿܿ;->᩸:Ll/֡ܳܿ;

    iput-object p2, p0, Ll/ۚܿܿ;->᩹:Ll/᩻ܳܿ;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    .line 2
    sget p1, Ll/֡ܳܿ;->֨ۧ:I

    const/4 p1, 0x1

    .line 275
    iget-object p2, p0, Ll/ۚܿܿ;->᩹:Ll/᩻ܳܿ;

    invoke-virtual {p2, p1}, Ll/᩻ܳܿ;->֫(Z)Ljava/util/ArrayList;

    .line 276
    invoke-static {}, Ll/۠ܳܿ;->ܿ()V

    const/4 p1, 0x0

    .line 277
    iget-object p2, p0, Ll/ۚܿܿ;->᩸:Ll/֡ܳܿ;

    invoke-virtual {p2, p1}, Ll/֡ܳܿ;->֫(Z)V

    return-void
.end method
