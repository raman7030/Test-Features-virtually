.class public final Ll/ۗۜ᩷;
.super Ljava/lang/Object;
.source "X7NV"

# interfaces
.implements Landroid/widget/AdapterView$OnItemSelectedListener;


# instance fields
.field public final synthetic ᩸:Ll/۬ۜ᩷;

.field public final synthetic ᩹:Lbin/mt/plugin/api/ui/PluginSpinner$OnItemSelectedListener;


# direct methods
.method public constructor <init>(Ll/۬ۜ᩷;Lbin/mt/plugin/api/ui/PluginSpinner$OnItemSelectedListener;)V
    .locals 0

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۗۜ᩷;->᩸:Ll/۬ۜ᩷;

    iput-object p2, p0, Ll/ۗۜ᩷;->᩹:Lbin/mt/plugin/api/ui/PluginSpinner$OnItemSelectedListener;

    return-void
.end method


# virtual methods
.method public final onItemSelected(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0

    .line 36
    iget-object p1, p0, Ll/ۗۜ᩷;->᩹:Lbin/mt/plugin/api/ui/PluginSpinner$OnItemSelectedListener;

    iget-object p2, p0, Ll/ۗۜ᩷;->᩸:Ll/۬ۜ᩷;

    invoke-interface {p1, p2, p3}, Lbin/mt/plugin/api/ui/PluginSpinner$OnItemSelectedListener;->onItemSelected(Lbin/mt/plugin/api/ui/PluginSpinner;I)V

    return-void
.end method

.method public final onNothingSelected(Landroid/widget/AdapterView;)V
    .locals 0

    return-void
.end method
