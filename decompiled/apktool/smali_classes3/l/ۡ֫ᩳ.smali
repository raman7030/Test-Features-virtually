.class public final synthetic Ll/ۡ֫ᩳ;
.super Ljava/lang/Object;
.source "B9R5"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ۙ:[Z

.field public final synthetic ᩶:[Ll/ۚ֫ᩳ;

.field public final synthetic ᩸:Ll/֨֫ᩳ;

.field public final synthetic ᩹:Ll/֡ۚۢ;


# direct methods
.method public synthetic constructor <init>(Ll/֨֫ᩳ;Ll/֡ۚۢ;[Ll/ۚ֫ᩳ;[Z)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۡ֫ᩳ;->᩸:Ll/֨֫ᩳ;

    iput-object p2, p0, Ll/ۡ֫ᩳ;->᩹:Ll/֡ۚۢ;

    iput-object p3, p0, Ll/ۡ֫ᩳ;->᩶:[Ll/ۚ֫ᩳ;

    iput-object p4, p0, Ll/ۡ֫ᩳ;->ۙ:[Z

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .line 2
    sget p1, Ll/֨֫ᩳ;->ܺۧ:I

    .line 503
    iget-object p1, p0, Ll/ۡ֫ᩳ;->᩹:Ll/֡ۚۢ;

    invoke-virtual {p1}, Ll/֡ۚۢ;->dismiss()V

    .line 504
    new-instance p1, Ll/ᩴ֫ᩳ;

    iget-object v0, p0, Ll/ۡ֫ᩳ;->᩸:Ll/֨֫ᩳ;

    iget-object v1, p0, Ll/ۡ֫ᩳ;->᩶:[Ll/ۚ֫ᩳ;

    iget-object v2, p0, Ll/ۡ֫ᩳ;->ۙ:[Z

    invoke-direct {p1, v0, v1, v2}, Ll/ᩴ֫ᩳ;-><init>(Ll/ۗܺ᩷;[Ll/ۚ֫ᩳ;[Z)V

    return-void
.end method
