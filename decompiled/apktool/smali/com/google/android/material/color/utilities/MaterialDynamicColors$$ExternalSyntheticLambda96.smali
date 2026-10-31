.class public final synthetic Lcom/google/android/material/color/utilities/MaterialDynamicColors$$ExternalSyntheticLambda96;
.super Ljava/lang/Object;
.source "MaterialDynamicColors"

# interfaces
.implements Ljava/util/function/Function;


# instance fields
.field public final synthetic $r8$classId:I

.field public final synthetic f$0:Lcom/google/android/material/color/utilities/MaterialDynamicColors;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/material/color/utilities/MaterialDynamicColors;I)V
    .locals 0

    .line 0
    iput p2, p0, Lcom/google/android/material/color/utilities/MaterialDynamicColors$$ExternalSyntheticLambda96;->$r8$classId:I

    iput-object p1, p0, Lcom/google/android/material/color/utilities/MaterialDynamicColors$$ExternalSyntheticLambda96;->f$0:Lcom/google/android/material/color/utilities/MaterialDynamicColors;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic andThen(Ljava/util/function/Function;)Ljava/util/function/Function;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩷ۛᩴ;->$default$andThen(Ljava/util/function/Function;Ljava/util/function/Function;)Ljava/util/function/Function;

    move-result-object p1

    return-object p1
.end method

.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 0
    iget v0, p0, Lcom/google/android/material/color/utilities/MaterialDynamicColors$$ExternalSyntheticLambda96;->$r8$classId:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/google/android/material/color/utilities/MaterialDynamicColors$$ExternalSyntheticLambda96;->f$0:Lcom/google/android/material/color/utilities/MaterialDynamicColors;

    check-cast p1, Lcom/google/android/material/color/utilities/DynamicScheme;

    invoke-static {v0, p1}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->$r8$lambda$WDm-R4NTIXrUQ5SITis2T8PvgjA(Lcom/google/android/material/color/utilities/MaterialDynamicColors;Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/DynamicColor;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lcom/google/android/material/color/utilities/MaterialDynamicColors$$ExternalSyntheticLambda96;->f$0:Lcom/google/android/material/color/utilities/MaterialDynamicColors;

    check-cast p1, Lcom/google/android/material/color/utilities/DynamicScheme;

    invoke-static {v0, p1}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->$r8$lambda$rk_GkmD-GcrNFM5lcwjoU7ZMqPM(Lcom/google/android/material/color/utilities/MaterialDynamicColors;Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/DynamicColor;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lcom/google/android/material/color/utilities/MaterialDynamicColors$$ExternalSyntheticLambda96;->f$0:Lcom/google/android/material/color/utilities/MaterialDynamicColors;

    check-cast p1, Lcom/google/android/material/color/utilities/DynamicScheme;

    invoke-static {v0, p1}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->$r8$lambda$-q1dCMb2SlEyzZwqMrtKptEsoAg(Lcom/google/android/material/color/utilities/MaterialDynamicColors;Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/ToneDeltaPair;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public synthetic compose(Ljava/util/function/Function;)Ljava/util/function/Function;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩷ۛᩴ;->$default$compose(Ljava/util/function/Function;Ljava/util/function/Function;)Ljava/util/function/Function;

    move-result-object p1

    return-object p1
.end method
