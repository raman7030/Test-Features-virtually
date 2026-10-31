.class public final Ll/ۚ᩹ۧ;
.super Ljava/lang/Object;
.source "S5T9"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# instance fields
.field public final synthetic ᩸:Ll/֨᩹ۧ;


# direct methods
.method public constructor <init>(Ll/֨᩹ۧ;)V
    .locals 0

    .line 234
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۚ᩹ۧ;->᩸:Ll/֨᩹ۧ;

    return-void
.end method


# virtual methods
.method public final onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 1

    .line 238
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iget-object v0, p0, Ll/ۚ᩹ۧ;->᩸:Ll/֨᩹ۧ;

    invoke-virtual {v0, p1}, Ll/֫᩸ۧ;->֫(Ljava/io/Serializable;)V

    .line 245
    invoke-virtual {v0, p2}, Ll/᩸᩹ۧ;->᩻(Z)V

    return-void
.end method
