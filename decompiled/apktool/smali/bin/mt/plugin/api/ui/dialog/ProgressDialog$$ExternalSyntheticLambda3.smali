.class public final synthetic Lbin/mt/plugin/api/ui/dialog/ProgressDialog$$ExternalSyntheticLambda3;
.super Ljava/lang/Object;
.source "ProgressDialog"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f$0:Lbin/mt/plugin/api/ui/dialog/ProgressDialog;

.field public final synthetic f$1:Z


# direct methods
.method public synthetic constructor <init>(Lbin/mt/plugin/api/ui/dialog/ProgressDialog;Z)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbin/mt/plugin/api/ui/dialog/ProgressDialog$$ExternalSyntheticLambda3;->f$0:Lbin/mt/plugin/api/ui/dialog/ProgressDialog;

    iput-boolean p2, p0, Lbin/mt/plugin/api/ui/dialog/ProgressDialog$$ExternalSyntheticLambda3;->f$1:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 0
    iget-object v0, p0, Lbin/mt/plugin/api/ui/dialog/ProgressDialog$$ExternalSyntheticLambda3;->f$0:Lbin/mt/plugin/api/ui/dialog/ProgressDialog;

    iget-boolean v1, p0, Lbin/mt/plugin/api/ui/dialog/ProgressDialog$$ExternalSyntheticLambda3;->f$1:Z

    invoke-static {v0, v1}, Lbin/mt/plugin/api/ui/dialog/ProgressDialog;->$r8$lambda$9k-SR9sSmmoOCDIj1lWJ-LZCjcI(Lbin/mt/plugin/api/ui/dialog/ProgressDialog;Z)V

    return-void
.end method
