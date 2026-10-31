.class public final synthetic Ll/֨᩻᩻;
.super Ljava/lang/Object;
.source "5AG9"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# instance fields
.field public final synthetic ۙ:Ll/֡᩻᩻;

.field public final synthetic ᩶:Ll/֡᩻᩻;

.field public final synthetic ᩸:Ll/֡᩻᩻;

.field public final synthetic ᩹:Ll/֡᩻᩻;


# direct methods
.method public synthetic constructor <init>(Ll/֡᩻᩻;Ll/֡᩻᩻;Ll/֡᩻᩻;Ll/֡᩻᩻;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֨᩻᩻;->᩸:Ll/֡᩻᩻;

    iput-object p2, p0, Ll/֨᩻᩻;->᩹:Ll/֡᩻᩻;

    iput-object p3, p0, Ll/֨᩻᩻;->᩶:Ll/֡᩻᩻;

    iput-object p4, p0, Ll/֨᩻᩻;->ۙ:Ll/֡᩻᩻;

    return-void
.end method


# virtual methods
.method public final onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 0

    xor-int/lit8 p1, p2, 0x1

    .line 221
    iget-object p2, p0, Ll/֨᩻᩻;->᩸:Ll/֡᩻᩻;

    invoke-virtual {p2, p1}, Ll/֡᩻᩻;->֫(Z)V

    .line 222
    iget-object p2, p0, Ll/֨᩻᩻;->᩹:Ll/֡᩻᩻;

    invoke-virtual {p2, p1}, Ll/֡᩻᩻;->֫(Z)V

    .line 223
    iget-object p2, p0, Ll/֨᩻᩻;->᩶:Ll/֡᩻᩻;

    invoke-virtual {p2, p1}, Ll/֡᩻᩻;->֫(Z)V

    .line 224
    iget-object p2, p0, Ll/֨᩻᩻;->ۙ:Ll/֡᩻᩻;

    invoke-virtual {p2, p1}, Ll/֡᩻᩻;->֫(Z)V

    return-void
.end method
