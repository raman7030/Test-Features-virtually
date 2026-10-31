.class public final synthetic Ll/ᩳۢۡ;
.super Ljava/lang/Object;
.source "J5HS"

# interfaces
.implements Landroid/widget/AdapterView$OnItemLongClickListener;


# instance fields
.field public final synthetic ᩸:Ll/ۢۢۡ;


# direct methods
.method public synthetic constructor <init>(Ll/ۢۢۡ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ᩳۢۡ;->᩸:Ll/ۢۢۡ;

    return-void
.end method


# virtual methods
.method public final onItemLongClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)Z
    .locals 6

    .line 0
    iget-object v0, p0, Ll/ᩳۢۡ;->᩸:Ll/ۢۢۡ;

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move-wide v4, p4

    invoke-static/range {v0 .. v5}, Ll/ۢۢۡ;->֫(Ll/ۢۢۡ;Landroid/widget/AdapterView;Landroid/view/View;IJ)Z

    move-result p1

    return p1
.end method
