.class public final synthetic Ll/ۗ۬᩷;
.super Ljava/lang/Object;
.source "81ID"

# interfaces
.implements Ll/ܶۖ;


# instance fields
.field public final synthetic ۗ:J

.field public final synthetic ۙ:I

.field public final synthetic ᩶:Landroid/view/View;

.field public final synthetic ᩸:Ll/֫۫᩷;

.field public final synthetic ᩹:Landroid/widget/AdapterView;


# direct methods
.method public synthetic constructor <init>(Ll/֫۫᩷;Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۗ۬᩷;->᩸:Ll/֫۫᩷;

    iput-object p2, p0, Ll/ۗ۬᩷;->᩹:Landroid/widget/AdapterView;

    iput-object p3, p0, Ll/ۗ۬᩷;->᩶:Landroid/view/View;

    iput p4, p0, Ll/ۗ۬᩷;->ۙ:I

    iput-wide p5, p0, Ll/ۗ۬᩷;->ۗ:J

    return-void
.end method


# virtual methods
.method public final onMenuItemClick(Landroid/view/MenuItem;)Z
    .locals 7

    .line 0
    iget v3, p0, Ll/ۗ۬᩷;->ۙ:I

    iget-wide v4, p0, Ll/ۗ۬᩷;->ۗ:J

    iget-object v0, p0, Ll/ۗ۬᩷;->᩸:Ll/֫۫᩷;

    iget-object v1, p0, Ll/ۗ۬᩷;->᩹:Landroid/widget/AdapterView;

    iget-object v2, p0, Ll/ۗ۬᩷;->᩶:Landroid/view/View;

    move-object v6, p1

    invoke-static/range {v0 .. v6}, Ll/֫۫᩷;->֫(Ll/֫۫᩷;Landroid/widget/AdapterView;Landroid/view/View;IJLandroid/view/MenuItem;)V

    const/4 p1, 0x1

    return p1
.end method
