package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;
import com.google.android.material.motion.MotionUtils;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.۠ۢۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 56XR */
/* JADX INFO: loaded from: classes3.dex */
public final class C8089 {
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static JSONObject m21460() {
        return C7416.m19939("type", "array", "description", "Non-fatal metadata, cleanup, or notification degradation.").add("items", C1648.m5545("string", "One warning message."));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m21459() {
        return C1648.m5535("Result for mt_apk_copy_entry. data identifies the copied raw payload, the normalized local path, and any warnings. For workspace_to_local, nextActions checks destination file metadata; for local_to_edit_session, it reads up to the first 256 bytes. Neither action verifies the complete copied content; a corrupt workspace may return mt_apk_workspace_open for retry.", C18736.m43390(JSON.object().add("direction", C1648.m5539("Completed copy direction.", "workspace_to_local", "local_to_edit_session")).add("workspaceId", C1648.m5545("string", "Workspace containing the source or destination entry.")).add("editSessionId", C1648.m5545("string", "Empty for a base workspace read; otherwise the observed or modified edit session.")).add("locator", C1648.m5545("string", "Copied ordinary zip_entry locator.")).add("localPath", C1648.m5545("string", "Normalized absolute local source or destination path fixed for this call.")).add("warnings", m21460()), "integer", "Number of bytes copied.", "size", "Successful workspace entry payload copy."), C1648.m5540(C1648.m5532(JSON.object().add("direction", C1648.m5542("string", "Requested direction, or null when it could not be parsed.")).add("workspaceId", C1648.m5542("string", "Workspace id, or null for an argument error.")).add("editSessionId", C1648.m5542("string", "Edit session id, including an empty base sentinel, or null.")).add("locator", C1648.m5542("string", "Normalized zip_entry locator, or null when unavailable.")).add("localPath", C1648.m5542("string", "Normalized absolute local path, or null before path resolution.")).add("changed", C1648.m5545(ClassTransform.BOOLEAN, "Whether the logical destination may already have changed.")).add("operationMode", C1648.m5542("string", "atomic or best_effort when a publication guarantee was selected.")).add("stateKnown", C1648.m5545(ClassTransform.BOOLEAN, "Whether the final destination state is known.")).add("warnings", m21460()).add("bytesCopied", C1648.m5542("integer", "Bytes copied before failure; this does not mean those bytes reached the destination. Null when unknown.")).add("safeToRetry", C1648.m5545(ClassTransform.BOOLEAN, "Whether retrying the same copy arguments is safe.")), "Stable workspace entry copy failure context; unavailable values are null.")), C1648.m5538("Success returns mt_file_stat for the local destination or mt_apk_read_bytes for up to the first 256 entry bytes. Neither checks complete content equality. A corrupt workspace whose source APK remains accessible may return mt_apk_workspace_open for retry.", C1648.m5533(C18736.m43390(JSON.object(), "string", "Normalized absolute copied local destination path.", MotionUtils.EASING_TYPE_PATH, "Arguments for mt_file_stat."), "mt_file_stat", "inspect"), C1648.m5533(C11166.m27698(), "mt_apk_read_bytes", "inspect"), C1648.m5533(C11166.m27702(), "mt_apk_workspace_open", "retry")));
    }
}
