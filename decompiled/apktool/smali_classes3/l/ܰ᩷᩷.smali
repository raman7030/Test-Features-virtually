.class public final synthetic Ll/ܰ᩷᩷;
.super Ljava/lang/Object;
.source "77QL"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ll/۟᩷᩷;

.field public final synthetic ᩹:Ll/۬ۜ᩷;


# direct methods
.method public synthetic constructor <init>(Ll/۟᩷᩷;Ll/۬ۜ᩷;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܰ᩷᩷;->᩸:Ll/۟᩷᩷;

    iput-object p2, p0, Ll/ܰ᩷᩷;->᩹:Ll/۬ۜ᩷;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 2
    iget-object v0, p0, Ll/ܰ᩷᩷;->᩹:Ll/۬ۜ᩷;

    .line 90
    iget-object v1, p0, Ll/ܰ᩷᩷;->᩸:Ll/۟᩷᩷;

    iget-object v1, v1, Ll/۟᩷᩷;->᩵:Lbin/mt/plugin/api/ui/PluginSpinner$OnItemSelectedListener;

    invoke-virtual {v0, v1}, Ll/۬ۜ᩷;->setOnItemSelectedListener(Lbin/mt/plugin/api/ui/PluginSpinner$OnItemSelectedListener;)V

    return-void
.end method
