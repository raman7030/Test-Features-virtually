.class public final synthetic Ll/ۖᩳ᩻;
.super Ljava/lang/Object;
.source "195D"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ᩶:Landroid/widget/TextView;

.field public final synthetic ᩸:Lbin/mt/plus/Main;

.field public final synthetic ᩹:Ljava/util/ArrayList;


# direct methods
.method public synthetic constructor <init>(Lbin/mt/plus/Main;Ljava/util/ArrayList;Landroid/widget/TextView;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۖᩳ᩻;->᩸:Lbin/mt/plus/Main;

    iput-object p2, p0, Ll/ۖᩳ᩻;->᩹:Ljava/util/ArrayList;

    iput-object p3, p0, Ll/ۖᩳ᩻;->᩶:Landroid/widget/TextView;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .line 70
    new-instance p1, Ll/ᩴ֫᩷;

    const/4 v0, 0x2

    iget-object v1, p0, Ll/ۖᩳ᩻;->᩶:Landroid/widget/TextView;

    iget-object v2, p0, Ll/ۖᩳ᩻;->᩹:Ljava/util/ArrayList;

    invoke-direct {p1, v0, v1, v2}, Ll/ᩴ֫᩷;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iget-object v0, p0, Ll/ۖᩳ᩻;->᩸:Lbin/mt/plus/Main;

    invoke-static {v0, v2, p1}, Ll/ۜ۫ܳ;->֫(Ll/ۗܺ᩷;Ljava/util/ArrayList;Ll/ᩴ֫᩷;)V

    return-void
.end method
