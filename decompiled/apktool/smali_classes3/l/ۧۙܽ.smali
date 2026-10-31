.class public final synthetic Ll/ۧۙܽ;
.super Ljava/lang/Object;
.source "28VT"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ᩸:Ll/᩹ۙܽ;

.field public final synthetic ᩹:Ll/֨۫ܽ;


# direct methods
.method public synthetic constructor <init>(Ll/᩹ۙܽ;Ll/֨۫ܽ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۧۙܽ;->᩸:Ll/᩹ۙܽ;

    iput-object p2, p0, Ll/ۧۙܽ;->᩹:Ll/֨۫ܽ;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .line 2
    sget p1, Ll/᩹ۙܽ;->᩵ۧ:I

    .line 4
    iget-object p1, p0, Ll/ۧۙܽ;->᩸:Ll/᩹ۙܽ;

    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 730
    iget-object v0, p0, Ll/ۧۙܽ;->᩹:Ll/֨۫ܽ;

    invoke-static {p1, v0}, Ll/۠۫ܽ;->֫(Ll/ۗܺ᩷;Ll/֨۫ܽ;)V

    return-void
.end method
