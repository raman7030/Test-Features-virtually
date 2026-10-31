.class public final synthetic Ll/ۛ۬᩻;
.super Ljava/lang/Object;
.source "Y6Y9"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# instance fields
.field public final synthetic ۗ:Landroid/widget/Button;

.field public final synthetic ۙ:Ll/ۗۘ;

.field public final synthetic ᩶:Ll/ۗۘ;

.field public final synthetic ᩸:Ll/ۗܺ᩷;

.field public final synthetic ᩹:Ll/֡ۚۢ;


# direct methods
.method public synthetic constructor <init>(Ll/ۗܺ᩷;Ll/֡ۚۢ;Ll/ۗۘ;Ll/ۗۘ;Landroid/widget/Button;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۛ۬᩻;->᩸:Ll/ۗܺ᩷;

    iput-object p2, p0, Ll/ۛ۬᩻;->᩹:Ll/֡ۚۢ;

    iput-object p3, p0, Ll/ۛ۬᩻;->᩶:Ll/ۗۘ;

    iput-object p4, p0, Ll/ۛ۬᩻;->ۙ:Ll/ۗۘ;

    iput-object p5, p0, Ll/ۛ۬᩻;->ۗ:Landroid/widget/Button;

    return-void
.end method


# virtual methods
.method public final onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 6

    .line 0
    iget-object v3, p0, Ll/ۛ۬᩻;->ۙ:Ll/ۗۘ;

    iget-object v4, p0, Ll/ۛ۬᩻;->ۗ:Landroid/widget/Button;

    iget-object v0, p0, Ll/ۛ۬᩻;->᩸:Ll/ۗܺ᩷;

    iget-object v1, p0, Ll/ۛ۬᩻;->᩹:Ll/֡ۚۢ;

    iget-object v2, p0, Ll/ۛ۬᩻;->᩶:Ll/ۗۘ;

    move v5, p2

    invoke-static/range {v0 .. v5}, Ll/ܿۤ᩻;->֫(Ll/ۗܺ᩷;Ll/֡ۚۢ;Ll/ۗۘ;Ll/ۗۘ;Landroid/widget/Button;Z)V

    return-void
.end method
