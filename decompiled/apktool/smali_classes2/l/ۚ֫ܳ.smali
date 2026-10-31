.class public final synthetic Ll/ۚ֫ܳ;
.super Ljava/lang/Object;
.source "1599"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# instance fields
.field public final synthetic ᩶:Ll/ۜܰܿ;

.field public final synthetic ᩸:Landroid/widget/EditText;

.field public final synthetic ᩹:Landroid/widget/EditText;


# direct methods
.method public synthetic constructor <init>(Landroid/widget/EditText;Landroid/widget/EditText;Ll/ۜܰܿ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۚ֫ܳ;->᩸:Landroid/widget/EditText;

    iput-object p2, p0, Ll/ۚ֫ܳ;->᩹:Landroid/widget/EditText;

    iput-object p3, p0, Ll/ۚ֫ܳ;->᩶:Ll/ۜܰܿ;

    return-void
.end method


# virtual methods
.method public final onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 2

    .line 0
    iget-object p1, p0, Ll/ۚ֫ܳ;->᩹:Landroid/widget/EditText;

    iget-object v0, p0, Ll/ۚ֫ܳ;->᩶:Ll/ۜܰܿ;

    iget-object v1, p0, Ll/ۚ֫ܳ;->᩸:Landroid/widget/EditText;

    invoke-static {v1, p1, v0, p2}, Ll/᩸֫ܳ;->֫(Landroid/widget/EditText;Landroid/widget/EditText;Ll/ۜܰܿ;Z)V

    return-void
.end method
